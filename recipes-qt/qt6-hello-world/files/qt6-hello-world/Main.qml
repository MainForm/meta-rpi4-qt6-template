import QtQuick
import QtQuick.Controls

Window {
    width: 1024
    height: 600
    visible: true
    title: qsTr("Hello World")

    Button {
        anchors.centerIn: parent
        text: qsTr("Hello world")
    }
}
