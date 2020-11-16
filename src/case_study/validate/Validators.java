package case_study.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String ID_HOUSE_REGEX = "^SVHO-\\d{4}$";
    public static final String ID_ROOM_REGEX = "^SVRO-\\d{4}";
    public static final String NAME_SERVICE = "^[A-Z][a-z]+$";
    public static final String AREA = "^[3-9][0-9]|[1-9]\\d{2}$";
    public static final String PRICE = "^[1-9][0-9]+[.][0-9]+$";
    public static final String PEOPLE = "^([1-9]|([1][0-9])|(20))$";
    public static final String NAME_SERVICE_ROOM = "^(massage|karaoke|food|drink|car)$";
    public static final String FLOOR = "^([0-9]{2}|[1-9])$";
    public static final String DAY = "^([1-9]|[1-2][0-9]|(3)[0-1])\\/0([1-9]|(1)[0-2])\\/((19)[0-9]{2}|(200)[0-3])$";
    public static final String NAME_CUSTOMER = "^([A-Z]?[a-z]+)+$";
    public static final String EMAIL_CUSTOMER = "\\w+\\@\\w+\\.\\w+";
    public static final String GENDER_CUSTOMER = "^(Male|Female|Unknow)$";
    public static final String CMND_CUSTOMER = "^\\d{9}$";
    public static Pattern pattern;
    public static Matcher matcher;
    public static void isIdVillaRegex(String idVilla) throws NameException {
        pattern = Pattern.compile(ID_VILLA_REGEX);
        matcher = pattern.matcher(idVilla);
        boolean flag  = matcher.matches();
        if (!flag){
            throw new NameException("yeu cau");
        }
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
    public static boolean isNameRegex(String name){
        pattern = Pattern.compile(NAME_SERVICE);
        matcher = pattern.matcher(name);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + name + "nhap lai theo " + NAME_SERVICE);
        }
        return flag;
    }
    public static boolean isArea(String area){
        pattern = Pattern.compile(AREA);
        matcher = pattern.matcher(area);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + area + "nhap lai theo " + AREA);
        }
        return flag;
    }
    public static boolean isPrice(String price){
        pattern = Pattern.compile(PRICE);
        matcher = pattern.matcher(price);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + price + "nhap lai theo " + PRICE);
        }
        return flag;
    }

    public static boolean isPeople(String people){
        pattern = Pattern.compile(PEOPLE);
        matcher = pattern.matcher(people);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + people + "nhap lai theo " + PEOPLE);
        }
        return flag;
    }

    public static boolean isNameServiceRoom(String name){
        pattern = Pattern.compile(NAME_SERVICE_ROOM);
        matcher = pattern.matcher(name);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + name + "nhap lai theo " + NAME_SERVICE_ROOM);
        }
        return flag;
    }

    public static boolean isFloor(String floor){
        pattern = Pattern.compile(FLOOR);
        matcher = pattern.matcher(floor);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + floor + "nhap lai theo " + FLOOR);
        }
        return flag;
    }
    public static boolean isDay(String day){
        pattern = Pattern.compile(DAY);
        matcher = pattern.matcher(day);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + day + "nhap lai theo " + DAY);
        }
        return flag;
    }
    public static boolean isNameCustomer(String name){
        pattern = Pattern.compile(NAME_CUSTOMER);
        matcher = pattern.matcher(name);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + name + "nhap lai theo " + NAME_CUSTOMER);
        }
        return flag;
    }
    public static boolean isEmailCustomer(String email){
        pattern = Pattern.compile(EMAIL_CUSTOMER);
        matcher = pattern.matcher(email);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + email + "nhap lai theo " + EMAIL_CUSTOMER);
        }
        return flag;
    }
    public static boolean isGenderCustomer(String gender){
        pattern = Pattern.compile(GENDER_CUSTOMER);
        matcher = pattern.matcher(gender);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + gender + "nhap lai theo " + GENDER_CUSTOMER);
        }
        return flag;
    }
    public static boolean isCMNDCustomer(String cmnd){
        pattern = Pattern.compile(CMND_CUSTOMER);
        matcher = pattern.matcher(cmnd);
        boolean flag  = matcher.matches();
        if (!flag){
            System.out.println("nhap sai :" + cmnd + "nhap lai theo " + CMND_CUSTOMER);
        }
        return flag;
    }
}
