B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Private txtInput As EditText
	Private imvIcon As Label
	Private mBorderColor As Int = Colors.ARGB(255,246,246,246)
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
    Tag = mBase.Tag
    mBase.Tag = Me 
  	Dim clr As Int = xui.PaintOrColorToColor(Props.Get("TextColor"))
	
	txtInput.Initialize("txtInput")
	
	mBase.Color = Colors.White
	
	txtInput.Color = Colors.Red
	mBase.AddView(txtInput, 10dip, 2dip, mBase.Width - 35dip, mBase.Height - 2dip)
	txtInput.Gravity = Gravity.CENTER_VERTICAL
	txtInput.Text = "Hello world"
		
	imvIcon.Initialize("")
	mBase.AddView(imvIcon, txtInput.Width, 2dip, 25dip, txtInput.Height)
	imvIcon.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL	
	
	txtInput.Color = Colors.Transparent
	mBase.SetColorAndBorder(Colors.White, 1dip, mBorderColor, 20dip)
	
	imvIcon.Typeface = Typeface.MATERIALICONS
	imvIcon.Text = Chr(0xE5DB)
	imvIcon.Color = Colors.Transparent
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub setIconTypeface(value As Typeface)
	imvIcon.Typeface = value
End Sub

Public Sub setIcon(value As String)
	imvIcon.Text = value
End Sub