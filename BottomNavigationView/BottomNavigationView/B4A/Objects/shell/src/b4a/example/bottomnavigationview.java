
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bottomnavigationview {
    public static RemoteObject myClass;
	public bottomnavigationview() {
	}
    public static PCBA staticBA = new PCBA(null, bottomnavigationview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _background = RemoteObject.createImmutable(0);
public static RemoteObject _coloricon = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _lstnavibutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _nvbutton = null;
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"background",_ref.getField(false, "_background"),"colorIcon",_ref.getField(false, "_coloricon"),"DateUtils",_ref.getField(false, "_dateutils"),"lstNaviButton",_ref.getField(false, "_lstnavibutton"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"nvButton",_ref.getField(false, "_nvbutton"),"selectedColor",_ref.getField(false, "_selectedcolor"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}