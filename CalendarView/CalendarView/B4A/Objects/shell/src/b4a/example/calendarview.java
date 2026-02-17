
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class calendarview {
    public static RemoteObject myClass;
	public calendarview() {
	}
    public static PCBA staticBA = new PCBA(null, calendarview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _pnldays = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlweek = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblmonth = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlmonth = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblday = null;
public static RemoteObject _fday = RemoteObject.createImmutable(0);
public static RemoteObject _maxday = RemoteObject.createImmutable(0);
public static RemoteObject _currentyear = RemoteObject.createImmutable(0);
public static RemoteObject _currentmonth = RemoteObject.createImmutable(0);
public static RemoteObject _currentday = RemoteObject.createImmutable(0);
public static RemoteObject _valuelong = RemoteObject.createImmutable(0L);
public static RemoteObject _valuestring = RemoteObject.createImmutable("");
public static RemoteObject _pnlbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _color1 = RemoteObject.createImmutable(0);
public static RemoteObject _color2 = RemoteObject.createImmutable(0);
public static RemoteObject _lstbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"color1",_ref.getField(false, "_color1"),"color2",_ref.getField(false, "_color2"),"currentDay",_ref.getField(false, "_currentday"),"currentMonth",_ref.getField(false, "_currentmonth"),"currentYear",_ref.getField(false, "_currentyear"),"fDay",_ref.getField(false, "_fday"),"lblDay",_ref.getField(false, "_lblday"),"lblMonth",_ref.getField(false, "_lblmonth"),"lstBitmap",_ref.getField(false, "_lstbitmap"),"maxDay",_ref.getField(false, "_maxday"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pnlBackground",_ref.getField(false, "_pnlbackground"),"pnlDays",_ref.getField(false, "_pnldays"),"pnlMonth",_ref.getField(false, "_pnlmonth"),"pnlWeek",_ref.getField(false, "_pnlweek"),"Tag",_ref.getField(false, "_tag"),"valueLong",_ref.getField(false, "_valuelong"),"valueString",_ref.getField(false, "_valuestring"),"xui",_ref.getField(false, "_xui")};
}
}