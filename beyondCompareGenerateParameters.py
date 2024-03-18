import sys

# file-report layout:side-by-side output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTest.html" output-options:html-color "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"
# file-report layout:side-by-side options:display-mismatches output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTest2.html" output-options:html-color "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"
# file-report layout:side-by-side output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTest.txt" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"
# data-report layout:side-by-side options:display-mismatches output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTestDifferences.txt" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"
# text-report layout:side-by-side options:display-mismatches output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTestDifferences2.txt" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"
# file-report layout:side-by-side output-to:"F:\Gabriel\github desktop\ModelTransformationWithLLMs\BeyondCompareScriptTest5.txt" output-options:html-color "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanOracle.java" "F:\Gabriel\github desktop\ModelTransformationWithLLMs\cleanGPT.java"

path = sys.argv[1] + '\\comparison\\bScripts.txt'

f = open(path, "w") #write to 
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptFullReport.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptOnlyErrors.html\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptTestFullReportText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("data-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptDifferencesData.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("text-report layout:side-by-side options:display-mismatches output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptDifferencesText.txt\" \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"\n")
f.write("file-report layout:side-by-side output-to:\"" + sys.argv[1] + "\\comparison\\BeyondCompareScriptDownloadedHTML.txt\" output-options:html-color \"" + sys.argv[2] + "\" \""  + sys.argv[3] + "\"")
f.close()