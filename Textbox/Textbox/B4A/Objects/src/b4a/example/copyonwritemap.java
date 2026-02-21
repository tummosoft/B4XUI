package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class copyonwritemap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.copyonwritemap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.copyonwritemap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _internalmap = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _class_globals(b4a.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Private InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim InternalMap As Map";
_internalmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="InternalMap.Initialize";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4a.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Return InternalMap.ContainsKey(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_key);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return false;
}
public String  _copymap(b4a.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "copymap", true))
	 {return ((String) Debug.delegate(ba, "copymap", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub CopyMap";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InternalMa";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (getActivityBA(),__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public Object  _get(b4a.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub Get (Key As Object) As Object";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Return InternalMap.Get(Key)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_key);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4a.example.copyonwritemap __ref,Object _key,Object _default) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_default}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetDefault (Key As Object, Default As O";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return InternalMap.GetDefault(Key, Default)";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_key,_default);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getmap(b4a.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getmap", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub GetMap As Map";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return InternalMap";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4a.example.copyonwritemap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Return InternalMap.Size";
if (true) return __ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.copyonwritemap __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Initialize (InitialItems As Map)";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="InternalMap = B4XCollections.MergeMaps(InitialIte";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xcollections._mergemaps /*anywheresoftware.b4a.objects.collections.Map*/ (getActivityBA(),_initialitems,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return "";
}
public String  _put(b4a.example.copyonwritemap __ref,Object _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="InternalMap.Put(Key, Value)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_value);
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="End Sub";
return "";
}
public String  _remove(b4a.example.copyonwritemap __ref,Object _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritemap";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub Remove (Key As Object)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="CopyMap";
__ref._copymap /*String*/ (null);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="InternalMap.Remove(Key)";
__ref._internalmap /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(_key);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="End Sub";
return "";
}
}