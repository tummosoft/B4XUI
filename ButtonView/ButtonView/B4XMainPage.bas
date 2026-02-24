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
	Private RoundButton1 As RoundButton
	Private RoundButton2 As RoundButton
	Private BitmapButton2 As BitmapButton
	Private RoundButton3 As RoundButton
	Private BitmapButton1 As BitmapButton
	Private BitmapButton3 As BitmapButton
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
		
	RoundButton1.SetIcon("")
	
	RoundButton2.SetFont(Typeface.MATERIALICONS)
	RoundButton2.SetIcon(Chr(0xE145))
	RoundButton2.SetColor(Colors.ARGB(255,40, 69, 214))
	RoundButton2.SetTextColor(Colors.White)
	RoundButton2.SetIconColor(Colors.White)
	
	RoundButton3.SetColor(Colors.ARGB(255,199, 234, 187))
	RoundButton3.SetTextColor(Colors.White)
	RoundButton3.Disabled = True
	
	BitmapButton1.Text = "Photos"
	BitmapButton1.TextSize = 10
	BitmapButton1.TextColor = Colors.Gray
	
	BitmapButton2.SetBitmap(File.DirAssets, "icons8-pdf-48.png")
	BitmapButton2.BackgroundColor = Colors.ARGB(255,244, 240, 228)
	BitmapButton2.Text = "PDF Files"
	BitmapButton2.TextSize = 10
	BitmapButton2.TextColor = Colors.Gray
	
	BitmapButton3.SetBitmap(File.DirAssets, "cloud-server.png")
	BitmapButton3.BackgroundColor = Colors.ARGB(255,240, 117, 174)
	BitmapButton3.Text = "Clouds"
	BitmapButton3.TextSize = 10
	BitmapButton3.TextColor = Colors.Gray
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub RoundButton2_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Private Sub BitmapButton3_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub