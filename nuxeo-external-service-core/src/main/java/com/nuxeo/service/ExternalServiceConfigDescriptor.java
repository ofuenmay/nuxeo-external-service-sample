/*
 * (C) Copyright 2020 Nuxeo (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Tiry
 */
package com.nuxeo.service;

import org.nuxeo.common.xmap.XMap;
import org.nuxeo.common.xmap.annotation.XNode;
import org.nuxeo.common.xmap.annotation.XObject;
import org.nuxeo.runtime.model.Descriptor;

/**
 * {@link XMap} object used to represent the configuration contribution to the {@link ExternalServiceWrapper} service
 * 
 * @author tiry
 *
 */
@XObject("externalService")
public class ExternalServiceConfigDescriptor implements Descriptor {

	@XNode("@id")
	private String id;

	@XNode("@name")
	private String name;

	@XNode("description")
	private String description;

	@XNode("label")
	private String label;

	@XNode("namespace")
	private String namespace;

	@Override
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLabel() {
		return label;
	}

	public String getNamespace() {
		return namespace;
	}

	
	

}
