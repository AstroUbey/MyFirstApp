package com.example.iubey.myfirstapp;

/**
 * Created by iUbey on 12/11/16.
 */

public class EmotionServiceClient {
    import com.microsoft.projectoxford.emotion.contract.FaceRectangle;
    import com.microsoft.projectoxford.emotion.contract.RecognizeResult;
    import com.microsoft.projectoxford.emotion.rest.EmotionServiceException;

    import java.io.IOException;
    import java.io.InputStream;
    import java.util.List;

    public class EmotionServiceClient {
        public List<RecognizeResult> recognizeImage(String url) throws EmotionServiceException;
        public List<RecognizeResult> recognizeImage(String url, FaceRectangle[] faceRectangles) throws EmotionServiceException;

        public List<RecognizeResult> recognizeImage(InputStream inputStream) throws EmotionServiceException, IOException;
        public List<RecognizeResult> recognizeImage(InputStream inputStream, FaceRectangle[] faceRectangles) throws EmotionServiceException, IOException;

}
