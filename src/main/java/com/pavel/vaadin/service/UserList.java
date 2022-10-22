package com.pavel.vaadin.service;

import com.pavel.vaadin.model.User;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserList extends VerticalLayout {

    public UserList(UserService userService) {
        Grid<User> grid = new Grid<>(User.class);
        grid.setItems(userService.getUsers());
        grid.setColumns("id", "name", "email", "phone", "website", "company.name");
        add(grid);
    }
}
