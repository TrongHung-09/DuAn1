/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.DanhMuc;

/**
 *
 * @author HÙNG
 */
public interface DanhMucService {

    public List<DanhMuc> getAll();

    public String add(DanhMuc danhMuc);

    public String update(DanhMuc danhMuc);

    public String delete(String id);
}
