package com.wsm.file;

import java.io.*;

/**
 * @author wangsenmu
 * @date 2020-9-1 11:26
 */
public class TestSerializable {


    public static String filePath = "D://test.txt";

    public static void main(String[] args) {

        new TestSerializable().writeUser(new User("张三", "18521560654", 1));
        new TestSerializable().readUser();

    }


    private void writeUser(User user) {
        try {
            ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream(new File(filePath)));
            objectInputStream.writeObject(user);
            objectInputStream.flush();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void readUser() {

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(filePath)));
            User user = (User) inputStream.readObject();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}


class User implements Serializable {

    private String name;
    private String phone;
    private Integer sex;

    public User(String name, String phone, Integer sex) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}