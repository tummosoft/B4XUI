B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=%PROJECT_NAME%.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI	
	Private BottomNavigationView1 As BottomNavigationView
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Dim nvButton(5) As clsNaviButton
	Dim baseWidth As Int = 100%x / nvButton.Length
	
	
	nvButton(0).Initialize
	nvButton(0).Icon = Chr(0xF015)
	nvButton(0).Font = Typeface.FONTAWESOME
	nvButton(0).Text = "Home"
	BottomNavigationView1.AddButton(nvButton(0))
	
	nvButton(1).Initialize
	nvButton(1).Icon =Chr(0xF073)
	nvButton(1).Font = Typeface.FONTAWESOME
	nvButton(1).Text ="Calendar"
	BottomNavigationView1.AddButton(nvButton(1))
		
	nvButton(2).Initialize
	nvButton(2).Font = Typeface.FONTAWESOME
	nvButton(2).Icon = Chr(0xF02B)
	nvButton(2).Text ="Category"
	BottomNavigationView1.AddButton(nvButton(2))
		
	nvButton(3).Initialize
	nvButton(3).Font = Typeface.MATERIALICONS
	nvButton(3).Icon = Chr(0xE0C8)
	nvButton(3).Text ="Location"
	BottomNavigationView1.AddButton(nvButton(3))
	
	nvButton(4).Initialize
	nvButton(4).Font = Typeface.MATERIALICONS
	nvButton(4).Icon =Chr(0xE7F4)
	nvButton(4).Text ="Notification"
	nvButton(4).Badge = "5"
	
	BottomNavigationView1.AddButton(nvButton(4))
	
	BottomNavigationView1.Build
	
	BottomNavigationView1.Acticve(1, True)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub nvButton_Click
	'xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Sub BottomNavigationView1_ItemClick(position As Int)
	Log("position=" & position)
	BottomNavigationView1.Acticve(position, True)
End Sub