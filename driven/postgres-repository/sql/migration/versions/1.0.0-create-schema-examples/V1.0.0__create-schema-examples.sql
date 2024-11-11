CREATE TABLE employees (
    employee_id VARCHAR(255) NOT NULL,
    managed_group_id VARCHAR(255) NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (employee_id, managed_group_id)
);

CREATE TABLE vacancy (
    id SERIAL PRIMARY KEY,
    start_date DATE,
    end_date DATE,
    onboarding_date DATE
);

CREATE TABLE vacancy_candidates (
    vacancy_id BIGINT NOT NULL,
    employee_id VARCHAR(255) NOT NULL,
    managed_group_id VARCHAR(255) NOT NULL,
    created_date DATE null,
    PRIMARY KEY (vacancy_id, employee_id, managed_group_id),
    FOREIGN KEY (vacancy_id) REFERENCES vacancy(id) ON DELETE CASCADE,
    FOREIGN KEY (employee_id, managed_group_id) REFERENCES employees(employee_id, managed_group_id) ON DELETE CASCADE
);
