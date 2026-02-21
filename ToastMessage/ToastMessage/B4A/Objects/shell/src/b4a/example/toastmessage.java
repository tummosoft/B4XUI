
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class toastmessage {
    public static RemoteObject myClass;
	public toastmessage() {
	}
    public static PCBA staticBA = new PCBA(null, toastmessage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _type_success = RemoteObject.createImmutable(0);
public static RemoteObject _type_warning = RemoteObject.createImmutable(0);
public static RemoteObject _type_info = RemoteObject.createImmutable(0);
public static RemoteObject _type_error = RemoteObject.createImmutable(0);
public static RemoteObject _imvicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblcontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fontsize = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fontsize",_ref.getField(false, "_fontsize"),"imvIcon",_ref.getField(false, "_imvicon"),"lblContent",_ref.getField(false, "_lblcontent"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"TYPE_ERROR",_ref.getField(false, "_type_error"),"TYPE_INFO",_ref.getField(false, "_type_info"),"TYPE_SUCCESS",_ref.getField(false, "_type_success"),"TYPE_WARNING",_ref.getField(false, "_type_warning"),"xui",_ref.getField(false, "_xui")};
}
}