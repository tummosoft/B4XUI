package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _memptymap = null;
public static anywheresoftware.b4a.objects.collections.List _memptylist = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.example.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.example.b4xbitset _s = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.example.b4xbitset();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "createlist", new Object[] {_ba,_items}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub CreateList (Items As List) As List";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="If Initialized(Items) Then res.AddAll(Items)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_items))) { 
_res.AddAll(_items);};
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim s As B4XSet";
_s = new b4a.example.b4xset();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getemptylist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "getemptylist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getemptylist", new Object[] {_ba}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub GetEmptyList As List";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If mEmptyList.IsInitialized = False Or mEmptyList";
if (_memptylist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptylist.getSize()>0) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim mEmptyList As List";
_memptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="mEmptyList.Initialize";
_memptylist.Initialize();
 };
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="Return mEmptyList";
if (true) return _memptylist;
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getemptymap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "getemptymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "getemptymap", new Object[] {_ba}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub GetEmptyMap As Map";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If mEmptyMap.IsInitialized = False Or mEmptyMap.S";
if (_memptymap.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptymap.getSize()>0) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim mEmptyMap As Map";
_memptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="mEmptyMap.Initialize";
_memptymap.Initialize();
 };
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Return mEmptyMap";
if (true) return _memptymap;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mergelists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _list1,anywheresoftware.b4a.objects.collections.List _list2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "mergelists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "mergelists", new Object[] {_ba,_list1,_list2}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub MergeLists (List1 As List, List2 As Lis";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="If Initialized(List1) Then res.AddAll(List1)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list1))) { 
_res.AddAll(_list1);};
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="If Initialized(List2) Then res.AddAll(List2)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list2))) { 
_res.AddAll(_list2);};
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "mergemaps", new Object[] {_ba,_map1,_map2}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
Object _key = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub MergeMaps (Map1 As Map, Map2 As Map) As";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="If Initialized(Map1) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map1))) { 
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="For Each key As Object In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="res.Put(key, Map1.Get(key))";
_res.Put(_key,_map1.Get(_key));
 }
};
 };
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="If Initialized(Map2) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map2))) { 
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="For Each key As Object In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _map2.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_key = group9.Get(index9);
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="res.Put(key, Map2.Get(key))";
_res.Put(_key,_map2.Get(_key));
 }
};
 };
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="End Sub";
return null;
}
public static String  _shufflelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "shufflelist", true))
	 {return ((String) Debug.delegate(null, "shufflelist", new Object[] {_ba,_items}));}
int _n = 0;
int _i = 0;
int _j = 0;
Object _o = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub ShuffleList (Items As List)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim n As Int = Items.Size";
_n = _items.getSize();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="For i = 0 To n - 2";
{
final int step2 = 1;
final int limit2 = (int) (_n-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim j As Int = Rnd(i, n)";
_j = anywheresoftware.b4a.keywords.Common.Rnd(_i,_n);
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Dim o As Object = Items.Get(i)";
_o = _items.Get(_i);
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Items.Set(i, Items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Items.Set(j, o)";
_items.Set(_j,_o);
 }
};
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sublist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items,int _startindex,int _endindex) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "sublist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "sublist", new Object[] {_ba,_items,_startindex,_endindex}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub SubList (Items As List, StartIndex As I";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="For i = StartIndex To EndIndex - 1";
{
final int step3 = 1;
final int limit3 = (int) (_endindex-1);
_i = _startindex ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="res.Add(Items.Get(i))";
_res.Add(_items.Get(_i));
 }
};
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="End Sub";
return null;
}
}