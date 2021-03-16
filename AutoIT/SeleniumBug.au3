WinWaitActive("Mozilla Firefox","","50")
if WinExists("Mozilla Firefox") Then
	Send("run-on{TAB}")
	Send("audiometer{Enter}")
	EndIf