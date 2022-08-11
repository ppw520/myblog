package com.ppw.myblog.common.exceptionhandler.excetion;

public enum BscExcetionEnum {

    BSC001("BSC001", "Y"),//北部湾
    BSC002("BSC002", "N");//中关村

    private String exCode;
    private String exMsg;

    private BscExcetionEnum(String exCode, String exMsg) {
        this.exCode = exCode;
        this.exMsg = exMsg;
    }

    public static String getValue(String exCode) {
        BscExcetionEnum[] carTypeEnums = values();
        for (BscExcetionEnum carTypeEnum : carTypeEnums) {
            if (carTypeEnum.exMsg().equals(exCode)) {
                return carTypeEnum.exMsg();
            }
        }
        return "N";
    }


    private String exCode() {
        return this.exCode;
    }

    private String exMsg() {
        return this.exMsg;
    }
}
