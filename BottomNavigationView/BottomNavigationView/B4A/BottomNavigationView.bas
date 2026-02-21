B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.4
@EndOfDesignText@
#Event: ItemClick(position as int)
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color
#DesignerProperty: Key: Color, DisplayName: Background Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Background Color

Sub Class_Globals
	Type clsNaviButton(Font As Typeface, Icon As String, Text As String, Badge as string)
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Private background As Int = Colors.White
	Private colorIcon As Int = Colors.ARGB(255, 141, 152, 166)
	Private selectedColor As Int = Colors.ARGB(255, 83, 2, 250)
	Private lstNaviButton As List
	Private nvButton(4) As NaviButton
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	lstNaviButton.Initialize
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	
    Tag = mBase.Tag
    mBase.Tag = Me 
  	Dim bgclr As Int = xui.PaintOrColorToColor(Props.Get("Color")) 'Example of getting a color value from Props
	mBase.Color = bgclr
	lstNaviButton.Initialize
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub AddButton(btnNavi As clsNaviButton)	
	lstNaviButton.Add(btnNavi)
End Sub

Public Sub Build
	Dim	positionX As Int = 0
	Dim nvButton(lstNaviButton.Size) As NaviButton
	Dim baseWidth As Int = 100%x / lstNaviButton.Size
	
	For i=0 To lstNaviButton.Size - 1
		Dim item As clsNaviButton = lstNaviButton.Get(i)
		nvButton(i).Initialize(Me, "nvButton", baseWidth)
		mBase.AddView(nvButton(i).GetView, positionX, 0dip,baseWidth, 50dip)
		positionX = positionX + baseWidth
		nvButton(i).Icon(item.icon)
		nvButton(i).Font(item.font)
		nvButton(i).Text(item.text)
		nvButton(i).Position = i
		If item.Badge <> Null Then
			nvButton(i).Badge = item.Badge
		End If
	Next
End Sub

Public Sub Acticve(index As Int, enable As Boolean)
	If enable = True Then
		For i=0 To lstNaviButton.Size - 1
			nvButton(i).Active(False)
		Next
		nvButton(index).Active(True)
	Else 
		nvButton(index).Active(False)
	End If
	
End Sub

Public Sub setColor(value As Int)
	background = value
	mBase.Color = background
End Sub

Public Sub setTextColor(value As Int)
	background = value
	mBase.Color = background
End Sub

Public Sub setIconColor(value As Int)
	colorIcon = value
End Sub

Public Sub setSelectedColor(value As Int)
	selectedColor = value
End Sub

Sub nvButton_Click
	Dim v As NaviButton = Sender
	CallSub2(mCallBack, mEventName & "_ItemClick", v.Position)
End Sub