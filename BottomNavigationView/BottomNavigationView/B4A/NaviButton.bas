B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
#Event: Click ()
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As Panel
	Private xui As XUI 'ignore
	Public Tag As Object
	Private imvIcon As Label
	Private lblText As Label
	Private baseWidth As Int = 50dip
	Private imvWidth As Int = 25dip
	Private fontsize As Int = 10
	Private index As Int = 0
	Dim imvLine As Label
	Dim lblBadge As Label
	Private colorIcon As Int = Colors.ARGB(255, 141, 152, 166)
	Private selectedColor As Int = Colors.ARGB(255, 83, 2, 250)
End Sub

Public Sub Initialize (Callback As Object, EventName As String, width As Int)
	baseWidth = width
	mEventName = EventName
	mCallBack = Callback
	mBase.Initialize("mBase")
	
	'mBase.Color = Colors.LightGray
	
		
	imvLine.Initialize("")
	imvLine.Color = selectedColor	
	mBase.AddView(imvLine, 0, 0, baseWidth, 2dip)
	imvLine.Visible = False
	
	imvIcon.Initialize("")
	Dim mLeft As Int = (width - imvWidth) / 2
	mBase.AddView(imvIcon, mLeft, 5dip, baseWidth, imvWidth)
	imvIcon.Typeface = Typeface.FONTAWESOME
	imvIcon.TextSize = 18
	imvIcon.TextColor = colorIcon
	imvIcon.Gravity = Gravity.CENTER
	
	lblBadge.Initialize("")
	mBase.AddView(lblBadge, imvIcon.Width / 2, 5dip, 12dip, 12dip)
	lblBadge.As(B4XView).SetColorAndBorder(Colors.ARGB(255,235, 76, 76), 0dip, Colors.Transparent, 6dip)
	lblBadge.Text = "5"
	lblBadge.TextSize = 8
	lblBadge.TextColor = Colors.White
	lblBadge.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
	lblBadge.Visible = False
	
				
	lblText.Initialize("")
	lblText.TextColor = colorIcon
	mBase.AddView(lblText, 0dip, 25dip, baseWidth, 20dip)
	
	lblText.Text = "Navi Button"
	lblText.Gravity = Gravity.CENTER	
	lblText.TextSize = fontsize
	
	'lblText.Color = Colors.Cyan
		
	mBase.Invalidate
End Sub

'Base type must be Object
Public Sub DesignerCreateView (base As Object, lbl As Label, Props As Map)
	mBase = base
    Tag = mBase.Tag
    mBase.Tag = Me 
  	Dim clr As Int = xui.PaintOrColorToColor(Props.Get("TextColor")) 
End Sub

Public Sub SetBaseColor(value As Int)
	mBase.Color = value
End Sub

Public Sub Resize(value As String)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(lblText)
	Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFAULT, fontsize)
	Dim r As B4XRect = cvs1.MeasureText(value, fnt)
	lblText.Width = r.Width + 10dip
	'mBase.Width = r.Width + 20dip
	imvIcon.Left = (mBase.Width - imvIcon.Width) / 2	
	'lblText.Left = (mBase.Width - lblText.Width) / 2
	imvLine.Width = mBase.Width
	lblText.Width = mBase.Width
	mBase.Invalidate	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

public Sub setBadge(value As String)
	If value <> "" Then
		lblBadge.Text = value
		lblBadge.Visible = True
	End If
End Sub

Public Sub Font(value As Typeface)
	imvIcon.Typeface = value
End Sub

Public Sub Text(value As String)
	Resize(value)
	lblText.Text = value
End Sub

Public Sub setTextSize(value As Int)
	lblText.TextSize = value
End Sub

Public Sub setTextColor(value As Int)
	lblText.TextColor = value
End Sub

Public Sub setPosition(value As Int)
	index = value
End Sub

Public Sub getPosition() As Int
	return index
End Sub

Public Sub Icon(value As String)
	imvIcon.Text = value
End Sub

Public Sub GetView() As Panel
	Return mBase
End Sub

Public Sub Active(value As Boolean)
	If value = True Then
		imvLine.Visible = True
		imvIcon.TextColor = selectedColor
		lblText.TextColor = selectedColor
	Else
		imvLine.Visible = False
		imvIcon.TextColor = colorIcon
		lblText.TextColor = colorIcon
	End If
End Sub

Sub mBase_Click()
	
	'imvLine.Visible = True
	imvIcon.TextColor = selectedColor
	lblText.TextColor = selectedColor
	Sleep(300)	
	'imvLine.Visible = False
	imvIcon.TextColor = colorIcon
	lblText.TextColor = colorIcon
	
	
	CallSub(mCallBack, mEventName & "_Click")
End Sub