
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class navibutton {
    public static RemoteObject myClass;
	public navibutton() {
	}
    public static PCBA staticBA = new PCBA(null, navibutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _imvicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _basewidth = RemoteObject.createImmutable(0);
public static RemoteObject _imvwidth = RemoteObject.createImmutable(0);
public static RemoteObject _fontsize = RemoteObject.createImmutable(0);
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _imvline = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblbadge = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _coloricon = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"baseWidth",_ref.getField(false, "_basewidth"),"colorIcon",_ref.getField(false, "_coloricon"),"DateUtils",_ref.getField(false, "_dateutils"),"fontsize",_ref.getField(false, "_fontsize"),"imvIcon",_ref.getField(false, "_imvicon"),"imvLine",_ref.getField(false, "_imvline"),"imvWidth",_ref.getField(false, "_imvwidth"),"index",_ref.getField(false, "_index"),"lblBadge",_ref.getField(false, "_lblbadge"),"lblText",_ref.getField(false, "_lbltext"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"selectedColor",_ref.getField(false, "_selectedcolor"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}