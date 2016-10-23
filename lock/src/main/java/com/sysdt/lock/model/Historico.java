package com.sysdt.lock.model;

import java.io.Serializable;
import java.util.Date;

public class Historico implements Serializable {
	
	private static final long serialVersionUID = -8143009670063829704L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column historico.id
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column historico.username
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column historico.fecha
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    private Date fecha;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column historico.placas_eco
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    private String placasEco;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column historico.estado
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    private Boolean estado;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column historico.id
     *
     * @return the value of historico.id
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column historico.id
     *
     * @param id the value for historico.id
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column historico.username
     *
     * @return the value of historico.username
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column historico.username
     *
     * @param username the value for historico.username
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column historico.fecha
     *
     * @return the value of historico.fecha
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column historico.fecha
     *
     * @param fecha the value for historico.fecha
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column historico.placas_eco
     *
     * @return the value of historico.placas_eco
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public String getPlacasEco() {
        return placasEco;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column historico.placas_eco
     *
     * @param placasEco the value for historico.placas_eco
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public void setPlacasEco(String placasEco) {
        this.placasEco = placasEco;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column historico.estado
     *
     * @return the value of historico.estado
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column historico.estado
     *
     * @param estado the value for historico.estado
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}