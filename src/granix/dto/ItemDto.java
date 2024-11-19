/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dto;

/**
 *
 * @author ASUS
 */
public class ItemDto {
     /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String id;
    private String name;
    

    public ItemDto() {
    }

    public ItemDto(String id, String name) {
        this.id = id;
        this.name = name;
        
    }

    

    @Override
    public String toString() {
        return "ItemDto{" + "id=" + id + ", name=" + name + '}';
    }
}
