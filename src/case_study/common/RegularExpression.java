package case_study.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String ID_HOUSE_REGEX = "^SVHO-\\d{4}$";
    public static final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";
    public static final String NAME_DICHVU = "^(Villa)|(House)|(Room)$";
    public static final String NAME_TYPE = "[A-Z]?[a-z]+";
    public static final String NAME_CUSTOMER = "^([A-Z]?[a-z]+)+$";
    public static final String EMAIL = "^\\w+(.\\w)*@\\w+.\\w+$";
    public static final String GIOI_TINH = "^(Male|FeMaLe|Unknown)$";
    public static final String CMND = "^\\d{9}$";
    public static final String NGAY_SINH = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
    public static Pattern pattern;
    public static Matcher matcher;
    public static boolean isIdVillaRegex(String idVilla){
        pattern = Pattern.compile(ID_VILLA_REGEX);
        matcher = pattern.matcher(idVilla);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + idVilla + "nhap lai theo " + ID_VILLA_REGEX);
        }
        return flag;
    }
    public static boolean isIdHouseRegex(String idHouse){
        pattern = Pattern.compile(ID_HOUSE_REGEX);
        matcher = pattern.matcher(idHouse);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + idHouse + "nhap lai theo " + ID_HOUSE_REGEX);
        }
        return flag;
    }
    public static boolean isIdRoomRegex(String idRoom){
        pattern = Pattern.compile(ID_ROOM_REGEX);
        matcher = pattern.matcher(idRoom);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + idRoom + "nhap lai theo " + ID_ROOM_REGEX);
        }
        return flag;
    }
    public static boolean isName(String name){
        pattern = Pattern.compile(NAME_DICHVU);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + NAME_DICHVU);
        }
        return flag;
    }
    public static boolean isNameType(String name){
        pattern = Pattern.compile(NAME_TYPE);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + NAME_TYPE);
        }
        return flag;
    }
    public static boolean isNameCustomer(String name){
        pattern = Pattern.compile(NAME_CUSTOMER);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + NAME_CUSTOMER);
        }
        return flag;
    }
    public static boolean isEmail(String name){
        pattern = Pattern.compile(EMAIL);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + EMAIL);
        }
        return flag;
    }
    public static boolean isGioiTinh(String name){
        pattern = Pattern.compile(GIOI_TINH);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + GIOI_TINH);
        }
        return flag;
    }
    public static boolean isCMND(String name){
        pattern = Pattern.compile(CMND);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + CMND);
        }
        return flag;
    }
    public static boolean isNgaySinh(String name){
        pattern = Pattern.compile(NGAY_SINH);
        matcher = pattern.matcher(name);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap sai" + name + "nhap lai theo " + NGAY_SINH);
        }
        return flag;
    }
}
