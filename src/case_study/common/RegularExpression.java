package case_study.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static final String ID_VILLA_REGEX = "SVVL-\\d{4}";
    public static final String ID_HOUSE_REGEX = "SVHO-\\d{4}";
    public static final String ID_ROOM_REGEX = "SVRO-\\d{4}";
    public static final String NAME_DICHVU = "^(Villa)|(House)|(Room)$";
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
}
