package cn.yanke.action;

import cn.yanke.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.web.context.ContextLoaderListener;

/**
 * Created by yanke on 2016/12/12.
 */
public class UserAction  extends ActionSupport{

    private UserService userService;

    public  void setUserService(UserService userService){
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {

        userService.add();
        System.out.println("action===========");


        return NONE;
    }
}
