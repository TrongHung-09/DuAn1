/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import model.DanhMuc;
import repository.DanhMucRepository;
import services.DanhMucService;

/**
 *
 * @author HÙNG
 */
public class DanhMucServiceImpl implements DanhMucService {

    private DanhMucRepository repository = new DanhMucRepository();

    @Override
    public List<DanhMuc> getAll() {
        return repository.getAll();
    }

    @Override
    public String add(DanhMuc danhMuc) {
        if (repository.add(danhMuc)) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(DanhMuc danhMuc) {
        if (repository.update(danhMuc)) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        if (repository.delete(id)) {
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
