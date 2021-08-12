import { ICustomUser } from 'app/shared/model/custom-user.model';

export interface IUserPhone {
  id?: number;
  phone?: string | null;
  isActive?: boolean | null;
  isPrimary?: boolean | null;
  tag?: string | null;
  customUser?: ICustomUser | null;
}

export const defaultValue: Readonly<IUserPhone> = {
  isActive: false,
  isPrimary: false,
};
