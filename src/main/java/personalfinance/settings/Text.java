package personalfinance.settings;

import java.util.HashMap;

final public class Text {
  private static final HashMap<String, String> data = new HashMap();

  public static String get(String key) {
      return data.get(key);
  }

  public static String[] getMonths() {
      String[] months = new String[12];
      months[0] = get("JANUARY");
      months[1] = get("FEBRUAR");
      months[2] = get("MARCH");
      months[3] = get("APRIL");
      months[4] = get("MAY");
      months[5] = get("JUNE");
      months[6] = get("JULE");
      months[7] = get("AUGUST");
      months[8] = get("SEPTEMBER");
      months[9] = get("OCTOBER");
      months[10] = get("NOVEMBER");
      months[11] = get("DECEMBER");
      return months;
  }
  public static void init() {
      data.put("PROGRAMM_NAME", "Домашняя бухгалтерия");
      data.put("MENU_FILE", "Файл");
      data.put("MENU_EDIT", "Правка");
      data.put("MENU_VIEW", "Вид");
      data.put("MENU_HELP", "Помощь");

      data.put("JANUARY", "Январь");
      data.put("FEBRUAR", "Февраль");
      data.put("MARCH", "Март");
      data.put("APRIL", "Апрель");
      data.put("MAY", "Май");
      data.put("JUNE", "Июнь");
      data.put("JULE", "Июль");
      data.put("AUGUST", "Август");
      data.put("SEPTEMBER", "Сентябрь");
      data.put("OCTOBER", "Октябрь");
      data.put("NOVEMBER", "Ноябрь");
      data.put("DECEMBER", "Декабрь");
  }
}
