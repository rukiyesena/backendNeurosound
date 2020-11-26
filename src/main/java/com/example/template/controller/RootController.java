package com.example.template.controller;

import com.example.template.App;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RootController  {

    @GetMapping
    public String index() {
        return App.APP_NAME + " " + App.VERSION;
    }


/*
    @GetMapping("/version")
    public String version() {
        return App.VERSION;
    }


    @PostMapping(value = "/login",params = {"title","password"})
    public String loginWithTitle(HttpSession httpSession,
                        @RequestParam String title,
                        @RequestParam String password) {
        UserDao userDao = new UserDao(masterSessionFactory);

        User user = userDao.getByTitle(title);
        if (!StringUtils.equals(user.getPassword(), password)) {
            ExceptionThrower.forbidden();
        }

        new SessionAdapter(httpSession).setUser(user);
        return httpSession.getId();
    }

    @PostMapping(value = "/login",params = {"phone","password"})
    public String loginWithPhone(HttpSession httpSession,
                                 @RequestParam String phone,
                                 @RequestParam String password) {
        UserDao userDao = new UserDao(masterSessionFactory);

        User user = userDao.getByPhone(phone);
        if (!StringUtils.equals(user.getPassword(), password)) {
            ExceptionThrower.forbidden();
        }

        new SessionAdapter(httpSession).setUser(user);
        return httpSession.getId();
    }



    @PostMapping("/token")
    @UserRoleAnnotation(userType = User.UserType.Student)
    public void updateToken(HttpSession httpSession, @RequestParam String token){
        SessionAdapter sessionAdapter = new SessionAdapter(httpSession);
        UserDao userDao = new UserDao(masterSessionFactory);
        User user = sessionAdapter.getUser();

        userDao.deleteToken(token);

        if(user.getUserType() == User.UserType.Student){
            StudentDao studentDao = new StudentDao(masterSessionFactory);
            Student student =  studentDao.get(user.getRef());
            student.setToken(token);
            studentDao.insertUpdateTransactional(student);
            sessionAdapter.setUser(student);
        }

        if(user.getUserType() == User.UserType.Teacher){
            TeacherDao teacherDao = new TeacherDao(masterSessionFactory);
            Teacher teacher = teacherDao.get(user.getRef());
            teacher.setToken(token);
            teacherDao.insertUpdateTransactional(teacher);
            sessionAdapter.setUser(teacher);
        }

    }

    @GetMapping("/remember")
    @UserRoleAnnotation(userType = User.UserType.Student)
    public void rememberMe(HttpSession httpSession, HttpServletResponse response) throws JsonProcessingException {
        SessionAdapter sessionAdapter = new SessionAdapter(httpSession);
        User user = sessionAdapter.getUser();

        RememberMe rememberMe = new RememberMe();
        rememberMe.phone = user.getPhone();
        rememberMe.expirationTime = LocalDateTime.now().plusDays(14);
        rememberMe.md5Hash = rememberMe.generateMd5(user.getPassword());

        int maxAge = 3600 * 24 * 14;

        Cookie cookieTitle = new Cookie("phone",rememberMe.phone);
        cookieTitle.setMaxAge(maxAge);
        Cookie cookieExpirationTime = new Cookie("expirationTime",rememberMe.expirationTimeString());
        cookieExpirationTime.setMaxAge(maxAge);
        Cookie cookieMd5 = new Cookie("md5Hash",rememberMe.md5Hash);
        cookieMd5.setMaxAge(maxAge);

        response.addCookie(cookieTitle);
        response.addCookie(cookieExpirationTime);
        response.addCookie(cookieMd5);

        response.setStatus(HttpStatus.OK.value());
    }

    @PostMapping("teacher/register")
    public void registerTeacher(HttpSession httpSession,
                         @RequestBody Teacher teacher) throws FirebaseAuthException {

        TeacherDao dao = new TeacherDao(masterSessionFactory);
        dao.insertTransactional(teacher);
    }

    @PostMapping("student/register")
    public void registerStudent(HttpSession httpSession,
                         @RequestBody Student student) throws FirebaseAuthException {
        StudentDao dao = new StudentDao(masterSessionFactory);

        dao.insertTransactional(student);
    }

    @PostMapping("/logout")
    @UserRoleAnnotation(userType = User.UserType.Student)
    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }
*/
}
