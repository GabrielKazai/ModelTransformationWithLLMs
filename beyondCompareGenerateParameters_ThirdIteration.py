import sys

path = sys.argv[1] + '\\comparison\\secondIteration\\thirdIteration\\bScripts.txt'

f = open(path, "w") 
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptFullReport.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptOnlyErrors.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptTestFullReportText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("data-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptDifferencesData.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("text-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptDifferencesText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\secondIteration\\thirdIteration\\BeyondCompareScriptDownloadedHTML.txt\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"")
f.close()