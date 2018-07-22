package mvn.security.access.factory;

import mvn.model.ProjectApplication;
import mvn.security.access.entity.ProjectApplicationPermissionEvaluator;
import de.terrestris.shogun2.model.PersistentObject;
import de.terrestris.shogun2.security.access.entity.PersistentObjectPermissionEvaluator;
import de.terrestris.shogun2.security.access.factory.EntityPermissionEvaluatorFactory;


/**
 * This is just a demo to show how the {@link EntityPermissionEvaluatorFactory}
 * from SHOGun2 can be extended to make use of it in a project specific
 * implementation.
 * 
 * This class has to be configured to be used for the permissionEvaluator (of
 * SHOGun2) in the security XML of this project.
 * 
 * @author Nils Bühner
 *
 */
public class ProjectEntityPermissionEvaluatorFactory<E extends PersistentObject> extends EntityPermissionEvaluatorFactory<E> {

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PersistentObjectPermissionEvaluator<E> getEntityPermissionEvaluator(
			final Class<E> entityClass) {

		if(ProjectApplication.class.isAssignableFrom(entityClass)) {
			return new ProjectApplicationPermissionEvaluator();
		}

		// call SHOGun2 implementation otherwise
		return super.getEntityPermissionEvaluator(entityClass);

	}

}
