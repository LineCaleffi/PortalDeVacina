import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormVacinasComponent } from './form-vacina.component';

describe('FormSeriesComponent', () => {
  let component: FormVacinasComponent;
  let fixture: ComponentFixture<FormVacinasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormVacinasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormVacinasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
