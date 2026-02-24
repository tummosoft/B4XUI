
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _roundbutton1 = RemoteObject.declareNull("b4a.example.roundbutton");
public static RemoteObject _roundbutton2 = RemoteObject.declareNull("b4a.example.roundbutton");
public static RemoteObject _bitmapbutton2 = RemoteObject.declareNull("b4a.example.bitmapbutton");
public static RemoteObject _roundbutton3 = RemoteObject.declareNull("b4a.example.roundbutton");
public static RemoteObject _bitmapbutton1 = RemoteObject.declareNull("b4a.example.bitmapbutton");
public static RemoteObject _bitmapbutton3 = RemoteObject.declareNull("b4a.example.bitmapbutton");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BitmapButton1",_ref.getField(false, "_bitmapbutton1"),"BitmapButton2",_ref.getField(false, "_bitmapbutton2"),"BitmapButton3",_ref.getField(false, "_bitmapbutton3"),"Root",_ref.getField(false, "_root"),"RoundButton1",_ref.getField(false, "_roundbutton1"),"RoundButton2",_ref.getField(false, "_roundbutton2"),"RoundButton3",_ref.getField(false, "_roundbutton3"),"xui",_ref.getField(false, "_xui")};
}
}