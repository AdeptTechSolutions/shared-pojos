//package org.ascend.shared.pojos;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class ResponseObject implements Serializable {
//
//    private static final long serialVersionUID = 8769226471422610190L;
//
//    private String status;
//
//    private String message;
//
//    private Object object;
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ResponseObject)) return false;
//        ResponseObject that = (ResponseObject) o;
//        return getStatus().equals(that.getStatus()) && getMessage().equals(that.getMessage()) && Objects.equals(getObject(), that.getObject());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getStatus(), getMessage(), getObject());
//    }
//
//    @Override
//    public String toString() {
//        return "shared.pojos.ResponseObject{" +
//                "status='" + status + '\'' +
//                ", message='" + message + '\'' +
//                ", object=" + object +
//                '}';
//    }
//}
