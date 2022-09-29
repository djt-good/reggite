package com.djt.controller;

import com.djt.common.BaseContext;
import com.djt.common.R;
import com.djt.domain.AddressBook;
import com.djt.mapper.AddressBookMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/addressBook")
@Slf4j
public class AddressController {
    @Resource
    AddressBookMapper addressBookMapper;
    @GetMapping("/list")
    public R<List<AddressBook>> selectAll(AddressBook addressBook){
       addressBook.setUserId(BaseContext.getCurrentId());
        List<AddressBook> select = addressBookMapper.select(addressBook);
        return new R<List<AddressBook>>(1,"success",select,null);
    }
    @PutMapping("/default")
    public R<String> Bydefault(@RequestBody  AddressBook addressBook){
        AddressBook addressBook1 = new AddressBook();
        addressBook1.setIsDefault(false);
        Example example =new Example(AddressBook.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",1);
        addressBookMapper.updateByExampleSelective(addressBook1,example);


        addressBook.setUserId(BaseContext.getCurrentId());
        addressBook.setIsDefault(true);
        Example example1 =new Example(AddressBook.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("id",addressBook.getId());

        addressBookMapper.updateByExampleSelective(addressBook,example1);
        return new  R<String>(1,"success",null,null);
    }

    @GetMapping("/default")
    public R<AddressBook> selectDefault(@RequestBody AddressBook addressBook){
        AddressBook addressBook1 = addressBookMapper.selectOne(addressBook);
        return new R<AddressBook>(1,"success",addressBook1,null);

    }

    @GetMapping("/{id}")
    public R<AddressBook> selectById(@PathVariable("id") Long id){
        AddressBook addressBook = addressBookMapper.selectByPrimaryKey(id);
        return new R<AddressBook>(1,"success",addressBook,null);
    }

    @PostMapping
    public R<String > save(HttpServletRequest request, @RequestBody AddressBook addressBook){
        addressBook.setUserId(BaseContext.getCurrentId());
        Long UserId = (Long) request.getSession().getAttribute("user");
        addressBook.setCreateUser(UserId);
        addressBook.setIsDefault(false);
        int i = addressBookMapper.insertSelective(addressBook);
        if (i >0){
            return new R<String>(1,"success",null,null);
        }
        return new R<String>(0,"fail",null,null);
    }

    @PutMapping
    public R<String > update(HttpServletRequest request,@RequestBody AddressBook addressBook){
        addressBook.setUserId(BaseContext.getCurrentId());
        Long UserId = (Long) request.getSession().getAttribute("user");
        addressBook.setCreateUser(UserId);
        addressBook.setIsDefault(false);
        int i = addressBookMapper.updateByPrimaryKeySelective(addressBook);
        if (i >0){
            return new R<String>(1,"success",null,null);
        }
        return new R<String>(0,"fail",null,null);
    }

}
