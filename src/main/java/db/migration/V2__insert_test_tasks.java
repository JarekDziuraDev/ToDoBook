package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class V2__insert_test_tasks extends BaseJavaMigration {
    @Override
    public void migrate(final Context context){
        new JdbcTemplate(new SingleConnectionDataSource(context.getConnection(), true))
                .execute("insert into task (description, done) values ('Test task 2', true)");
    }
}
