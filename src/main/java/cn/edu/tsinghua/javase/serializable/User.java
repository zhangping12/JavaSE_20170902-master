package cn.edu.tsinghua.javase.serializable;

import java.io.Serializable;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:45 03 Nov 2017
 */
public class User implements Serializable {

//    private static final long serialVersionUID = 123123123050034L;

    private Integer id;
    private String name;
//    private transient String password;
    private double height;
    private transient boolean married; // 瞬态\ ['trænzɪənt]

    public User() {
    }

    public User(Integer id, String name, double height, boolean married) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.married = married;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", married=" + married +
                '}';
    }
}

class SubUser extends User {

}


