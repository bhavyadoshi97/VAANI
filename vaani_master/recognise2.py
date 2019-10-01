import cv2
import numpy as np


def nothing(x):
    pass


image_x, image_y = 64, 64

from keras.models import load_model

classifier = load_model('HandyNew.h5')


def predictor():
    import numpy as np
    from keras.preprocessing import image
    test_image = image.load_img("1.jpg", target_size=(64, 64))
    test_image = image.img_to_array(test_image)
    test_image = np.expand_dims(test_image, axis=0)
    result = classifier.predict(test_image)
    print(result)
    if result[0][0] == max(result[0]):
        return 'Bye'
    elif result[0][1] == max(result[0]):
        return 'HELLO'
    elif result[0][2] == max(result[0]):
        return 'Help'
    elif result[0][3] == max(result[0]):
        return 'I'
    elif result[0][4] == max(result[0]):
        return 'I love you'
    elif result[0][5] == max(result[0]):
        return 'Nothing'
    elif result[0][6] == max(result[0]):
        return 'Stop'
    elif result[0][7] == max(result[0]):
        return 'thank you'


#print(predictor())

cam = cv2.VideoCapture(0)

cv2.namedWindow("Trackbars")

cv2.createTrackbar("L - H", "Trackbars", 0, 179, nothing)
cv2.createTrackbar("L - S", "Trackbars", 20, 255, nothing)
cv2.createTrackbar("L - V", "Trackbars", 80, 255, nothing)
cv2.createTrackbar("U - H", "Trackbars", 20, 179, nothing)
cv2.createTrackbar("U - S", "Trackbars", 255, 255, nothing)
cv2.createTrackbar("U - V", "Trackbars", 255, 255, nothing)

cv2.namedWindow("test")

img_counter = 0

img_text = ''
while True:
    ret, frame = cam.read()
    if not ret:
        break
    frame = cv2.flip(frame, 1)
    l_h = cv2.getTrackbarPos("L - H", "Trackbars")
    l_s = cv2.getTrackbarPos("L - S", "Trackbars")
    l_v = cv2.getTrackbarPos("L - V", "Trackbars")
    u_h = cv2.getTrackbarPos("U - H", "Trackbars")
    u_s = cv2.getTrackbarPos("U - S", "Trackbars")
    u_v = cv2.getTrackbarPos("U - V", "Trackbars")

    img = cv2.rectangle(frame, (425, 100), (625, 300), (0, 255, 0), thickness=2, lineType=8, shift=0)

    lower_blue = np.array([l_h, l_s, l_v])
    upper_blue = np.array([u_h, u_s, u_v])
    imcrop = img[102:298, 427:623]
    hsv = cv2.cvtColor(imcrop, cv2.COLOR_BGR2HSV)
    print('>>>>>>>>>>>>>',hsv.shape)
    mask = cv2.inRange(hsv, lower_blue, upper_blue)

    cv2.putText(frame, img_text, (30, 400), cv2.FONT_HERSHEY_TRIPLEX, 1.5, (0, 255, 0))
    cv2.imshow("test", frame)
    cv2.imshow("mask", mask)

    # if cv2.waitKey(1) == ord('c'):

    img_name = "1.jpg"
    save_img = cv2.resize(mask, (image_x, image_y))
    cv2.imwrite(img_name, save_img)
    print("{} written!".format(img_name))
    img_text = predictor()
    print(img_text)
    if cv2.waitKey(1) == 27:
        break

cam.release()
cv2.destroyAllWindows()
