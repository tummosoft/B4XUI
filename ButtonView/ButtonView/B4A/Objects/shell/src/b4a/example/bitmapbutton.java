
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bitmapbutton {
    public static RemoteObject myClass;
	public bitmapbutton() {
	}
    public static PCBA staticBA = new PCBA(null, bitmapbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _pnlbgbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imvicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mwidth = RemoteObject.createImmutable(0);
public static RemoteObject _mheight = RemoteObject.createImmutable(0);
public static RemoteObject _lbltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _mradius = RemoteObject.createImmutable(0);
public static RemoteObject _bgcolor = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bgColor",_ref.getField(false, "_bgcolor"),"imvIcon",_ref.getField(false, "_imvicon"),"lblText",_ref.getField(false, "_lbltext"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mHeight",_ref.getField(false, "_mheight"),"mRadius",_ref.getField(false, "_mradius"),"mWidth",_ref.getField(false, "_mwidth"),"pnlBgButton",_ref.getField(false, "_pnlbgbutton"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}