import cv2


def bounded_box(self):
    left_handy = cv2.CascadeClassifier('left.xml')

    right_handy = cv2.CascadeClassifier('right.xml')

    fisty = cv2.CascadeClassifier('fist.xml')

    rpalmy = cv2.CascadeClassifier('rpalm.xml')
    lpalmy = cv2.CascadeClassifier('lpalm.xml')

    cap = cv2.VideoCapture(0)

    while 1:
        ret, img = cap.read()

        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        left_rec = left_handy.detectMultiScale(gray, 1.3, 5)

        if len(left_rec) == 0:
            print "No left hand found"
        else:
            print left_rec
            print left_rec.shape
            print "Number of left hand detected: " + str(left_rec.shape[0])

            cv2.putText(img, text="ON YOUR LEFT!!!`", org=(100, 100),
                        fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1,
                        color=(255, 0, 0), thickness=1, lineType=cv2.LINE_AA)

        right_rec = right_handy.detectMultiScale(gray, 1.3, 5)

        if len(right_rec) == 0:
            print "No right hand found"
        else:
            print right_rec
            print right_rec.shape
            print "Number of right hand detected: " + str(right_rec.shape[0])

            cv2.putText(img, text="ON YOUR RIGHT", org=(50, 50),
                        fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1,
                        color=(255, 255, 255), thickness=1, lineType=cv2.LINE_AA)

        fist_dec = fisty.detectMultiScale(gray, 1.3, 5)
        if len(fist_dec) == 0:
            print "No right hand found"
        else:
            print fist_dec
            print fist_dec.shape
            print "Number of fist detected: " + str(fist_dec.shape[0])

            cv2.putText(img, text="STOP STOP STOP", org=(50, 50),
                        fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1,
                        color=(255, 255, 255), thickness=1, lineType=cv2.LINE_AA)
        lpam_dec = lpalmy.detectMultiScale(gray, 1.3, 5)
        if len(lpam_dec) == 0:
            print "No left palm found"
        else:
            print lpam_dec
            print lpam_dec.shape
            print "Number of left palms detected: " + str(lpam_dec.shape[0])

            cv2.putText(img, text="HELLO!!!!", org=(50, 50),
                        fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1,
                        color=(255, 255, 255), thickness=1, lineType=cv2.LINE_AA)
        rpam_dec = rpalmy.detectMultiScale(gray, 1.3, 5)
        if len(rpam_dec) == 0:
            print "No right palm found"
        else:
            print rpam_dec
            print rpam_dec.shape
            print "HELLO"

            cv2.putText(img, text="HELLO !!!", org=(50, 50),
                        fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1,
                        color=(255, 255, 255), thickness=1, lineType=cv2.LINE_AA)

        cv2.imshow('img', img)

        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    cap.release()

    cv2.destroyAllWindows()
