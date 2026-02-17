
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class calendarbox {
    public static RemoteObject myClass;
	public calendarbox() {
	}
    public static PCBA staticBA = new PCBA(null, calendarbox.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _pnlwrapper = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlbottom = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _vbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lbltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lstevent = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _hasevent = RemoteObject.createImmutable(false);
public static RemoteObject _ldate = RemoteObject.createImmutable(0L);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"hasEvent",_ref.getField(false, "_hasevent"),"lblText",_ref.getField(false, "_lbltext"),"lDate",_ref.getField(false, "_ldate"),"lstEvent",_ref.getField(false, "_lstevent"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pnlBottom",_ref.getField(false, "_pnlbottom"),"pnlWrapper",_ref.getField(false, "_pnlwrapper"),"Tag",_ref.getField(false, "_tag"),"vBitmap",_ref.getField(false, "_vbitmap"),"xui",_ref.getField(false, "_xui")};
}
}