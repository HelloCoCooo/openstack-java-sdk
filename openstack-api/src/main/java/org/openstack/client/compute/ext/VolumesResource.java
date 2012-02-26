package org.openstack.client.compute.ext;

import org.openstack.client.common.Resource;
import org.openstack.client.common.ResourceExtension;
import org.openstack.model.compute.VolumeList;

import com.sun.jersey.api.client.WebResource.Builder;

/**
 * The volume types API controller for the Openstack API
 * 
 * @author sp
 * 
 */
public class VolumesResource extends Resource implements ResourceExtension {
	
	/**
	 * Returns the list of volume types
	 * 
	 * @return
	 */
	public VolumeList list(boolean detail) {
		Builder r = detail ? resource("detail") : resource();
		return r.get(VolumeList.class);
	}

	/**
	 * Creates a new volume type.
	 * 
	 * @param flavor
	 * @return
	 */
//	public Volume create(Volume volume) {
//		return null;
//	}

	public VolumeResource volume(String id) {
		return buildChildResource(id, VolumeResource.class);
	}

}
