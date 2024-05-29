import sys

path = sys.argv[1] + '\\comparison\\secondIteration\\bScripts.txt'

f = open(path, "w") 
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptFullReport.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptOnlyErrors.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptTestFullReportText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("data-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptDifferencesData.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("text-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptDifferencesText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\BeyondCompareScriptDownloadedHTML.txt\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"")
f.close()