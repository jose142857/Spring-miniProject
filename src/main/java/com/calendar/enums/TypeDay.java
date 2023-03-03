package com.calendar.enums;

public enum TypeDay {
	休みの日("休みの日"), 出社("出社");
	
	private String typeDay;
	 
    private TypeDay(String typeDay) {
        this.typeDay = typeDay;
    }
 
    public String getTypeDay() {
        return typeDay;
    }
    
    public static TypeDay fromTypeDay(String typeDay) {
        switch (typeDay) {
        case "出社":
            return TypeDay.出社;
 
        case "休みの日":
            return TypeDay.休みの日;
        default:
            throw new IllegalArgumentException("TypeDay [" + typeDay
                    + "] not supported.");
        }
    }
}
