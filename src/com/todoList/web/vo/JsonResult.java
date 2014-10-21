package com.todoList.web.vo;

import java.io.Serializable;

public class JsonResult implements Serializable
{
    private static final long serialVersionUID = 2671309128222512679L;
    private String mesg;
    private boolean success;
    public JsonResult(String mesg, boolean success)
    {
        this.mesg = mesg;
        this.success = success;
    }
    public JsonResult()
    {
        
    }
    public String getMesg()
    {
        return mesg;
    }
    public void setMesg(String mesg)
    {
        this.mesg = mesg;
    }
    public boolean isSuccess()
    {
        return success;
    }
    public void setSuccess(boolean success)
    {
        this.success = success;
    }
    
}
