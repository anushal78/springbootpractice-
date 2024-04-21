package com.example.SpringbootJDBC;
import com.example.SpringbootJDBC;
import org.springframework.jdbc.core.jdbcTemplate;
import org.Springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo{

    private jdbcTemplate template;

    public jdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(jdbcTemplate template) {
        this.template = template;
    }

    public void save(Student student){
        String sql = "import into student(id, name, tech) values(?,?,?)"
        template.update(sql, student.getId(), student.getName(), student.getTech());
    }

    public List<Student> findAll(){

        String sql = "select * from student";

        RowMapper<Student> mapper = new RowMapper<Student>(){
           @Override
           Public Student mapRow(ResultSet cs, int rownum) throws SQLException{

               Student a = new Student();
               a.setId(rs.getInt(1));
               a.setName(rs.getString(2));
               a.setTech(rs.getString(3));
               return a;
            }
        };
        List<Student> student = template.query(sql, mapper);
        return student;
    }
}