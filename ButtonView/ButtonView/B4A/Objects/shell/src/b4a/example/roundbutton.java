
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class roundbutton {
    public static RemoteObject myClass;
	public roundbutton() {
	}
    public static PCBA staticBA = new PCBA(null, roundbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _imvicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlwrapper = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _basecolor = RemoteObject.createImmutable(0);
public static RemoteObject _basebackground = RemoteObject.createImmutable(0);
public static RemoteObject _iconcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mdisabled = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"baseBackground",_ref.getField(false, "_basebackground"),"baseColor",_ref.getField(false, "_basecolor"),"iconColor",_ref.getField(false, "_iconcolor"),"imvIcon",_ref.getField(false, "_imvicon"),"lblText",_ref.getField(false, "_lbltext"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mDisabled",_ref.getField(false, "_mdisabled"),"mEventName",_ref.getField(false, "_meventname"),"pnlWrapper",_ref.getField(false, "_pnlwrapper"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}