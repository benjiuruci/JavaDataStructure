package com.benjiuruci.JavaDataStructure.NodeTree;

/**
 * 汽车配件实体类
 * @Author: qinxianzhong
 * @Date: 2022/5/18 22:49
 */
public class AutoParts {
    //尺寸
    private int size;
    //发动机
    private String engine;
    //轮胎
    private String tyre;
    //玻璃
    private String glass;



    public AutoParts(int size,String engine,String tyre,String glass){
        this.size = size;
        this.engine = engine;
        this.tyre = tyre;
        this.glass = glass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }
    @Override
    public String toString(){
        return "engine:" + engine + " tyre:" + tyre + " glass:" + glass;
    }
}
