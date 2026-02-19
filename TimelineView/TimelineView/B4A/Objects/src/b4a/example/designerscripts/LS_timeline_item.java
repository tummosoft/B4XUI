package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_timeline_item{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel2").vw.setWidth((int)((100d / 100 * width)));
views.get("panel2").vw.setHeight((int)((140d * scale)));
views.get("panel1").vw.setHeight((int)((120d * scale)));
//BA.debugLineNum = 7;BA.debugLine="Panel1.Top = 0"[timeline_item/General script]
views.get("panel1").vw.setTop((int)(0d));
//BA.debugLineNum = 9;BA.debugLine="lblContent.Height = 40dip"[timeline_item/General script]
views.get("lblcontent").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 10;BA.debugLine="lblContent.Width = Panel1.Width - 40dip"[timeline_item/General script]
views.get("lblcontent").vw.setWidth((int)((views.get("panel1").vw.getWidth())-(40d * scale)));
//BA.debugLineNum = 11;BA.debugLine="lblContent.Left = 10dip"[timeline_item/General script]
views.get("lblcontent").vw.setLeft((int)((10d * scale)));
//BA.debugLineNum = 12;BA.debugLine="pnlButtonGroup.Width = lblContent.Width"[timeline_item/General script]
views.get("pnlbuttongroup").vw.setWidth((int)((views.get("lblcontent").vw.getWidth())));
//BA.debugLineNum = 13;BA.debugLine="pnlButtonGroup.Left = lblContent.Left"[timeline_item/General script]
views.get("pnlbuttongroup").vw.setLeft((int)((views.get("lblcontent").vw.getLeft())));
//BA.debugLineNum = 14;BA.debugLine="pnlButtonGroup.Top = lblContent.Height + lblContent.Top"[timeline_item/General script]
views.get("pnlbuttongroup").vw.setTop((int)((views.get("lblcontent").vw.getHeight())+(views.get("lblcontent").vw.getTop())));
//BA.debugLineNum = 15;BA.debugLine="Button2.Top = 0"[timeline_item/General script]
views.get("button2").vw.setTop((int)(0d));
//BA.debugLineNum = 16;BA.debugLine="Button1.Top = 0"[timeline_item/General script]
views.get("button1").vw.setTop((int)(0d));
//BA.debugLineNum = 17;BA.debugLine="Button2.Left  = pnlButtonGroup.Width - (Button2.Width + 10dip)"[timeline_item/General script]
views.get("button2").vw.setLeft((int)((views.get("pnlbuttongroup").vw.getWidth())-((views.get("button2").vw.getWidth())+(10d * scale))));
//BA.debugLineNum = 18;BA.debugLine="Button1.Left = Button2.Left - (Button1.Left + Button1.Width) + 10dip"[timeline_item/General script]
views.get("button1").vw.setLeft((int)((views.get("button2").vw.getLeft())-((views.get("button1").vw.getLeft())+(views.get("button1").vw.getWidth()))+(10d * scale)));

}
}