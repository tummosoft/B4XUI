package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class copyonwritelist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.copyonwritelist");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.copyonwritelist.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _internallist = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _add(b4a.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_item}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub Add (Item As Object)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="InternalList.Add(Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public String  _makecopy(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "makecopy", true))
	 {return ((String) Debug.delegate(ba, "makecopy", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub MakeCopy";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="InternalList = B4XCollections.CreateList(Internal";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (getActivityBA(),__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4a.example.copyonwritelist __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_items}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub AddAll (Items As List)";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="InternalList.AddAll(Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_items);
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return "";
}
public String  _addallat(b4a.example.copyonwritelist __ref,int _index,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addallat", true))
	 {return ((String) Debug.delegate(ba, "addallat", new Object[] {_index,_items}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub AddAllAt (Index As Int, Items As List)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="InternalList.AddAllAt(Index, Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_index,_items);
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Private InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="InternalList.Initialize";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4a.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub Get (Index As Int) As Boolean";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Return InternalList.Get(Index)";
if (true) return BA.ObjectToBoolean(__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getlist(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getlist", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub GetList As List";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return InternalList";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Return InternalList.Size";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub IndexOf (Item As Object) As Int";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Return InternalList.IndexOf(Item)";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.copyonwritelist __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub Initialize (InitialItems As List)";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="InternalList = B4XCollections.CreateList(InitialI";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (getActivityBA(),_initialitems);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _insertat(b4a.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "insertat", true))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_item}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub InsertAt (Index As Int, Item As Object)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="InternalList.InsertAt(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_item);
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4a.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub RemoveAt (Index As Int)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="InternalList.RemoveAt(Index)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return "";
}
public String  _set(b4a.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_item}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub Set (Index As Int, Item As Object)";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="InternalList.Set(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Set(_index,_item);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4a.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_ascending}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Sort (Ascending As Boolean)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="InternalList.Sort(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Sort(_ascending);
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="End Sub";
return "";
}
public String  _sortcaseinsensitive(b4a.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sortcaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sortcaseinsensitive", new Object[] {_ascending}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub SortCaseInsensitive (Ascending As Boole";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="InternalList.SortCaseInsensitive(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="End Sub";
return "";
}
public String  _sorttype(b4a.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttype", true))
	 {return ((String) Debug.delegate(ba, "sorttype", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub SortType (FieldName As String, Ascendin";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="InternalList.SortType(FieldName, Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortType(_fieldname,_ascending);
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="End Sub";
return "";
}
public String  _sorttypecaseinsensitive(b4a.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttypecaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sorttypecaseinsensitive", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub SortTypeCaseInsensitive (FieldName As S";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="InternalList.SortTypeCaseInsensitive(FieldName, A";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortTypeCaseInsensitive(_fieldname,_ascending);
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="End Sub";
return "";
}
}