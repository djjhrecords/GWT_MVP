package acme.client.mvp;

import acme.client.ClientFactory;
import acme.client.activity.MainActivity;
import acme.client.activity.RegisterAuthorActivity;
import acme.client.activity.RegisterCustomerActivity;
import acme.client.activity.RegisterMaterialActivity;
import acme.client.place.MainPlace;
import acme.client.place.RegisterAuthorPlace;
import acme.client.place.RegisterCustomerPlace;
import acme.client.place.RegisterMaterialPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper 
{
	private ClientFactory clientFactory;
	
	public AppActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) 
	{
		
		if (place instanceof RegisterCustomerPlace)
		{
			return new RegisterCustomerActivity((RegisterCustomerPlace)place, clientFactory);
		}
		else if (place instanceof RegisterAuthorPlace)
		{
			return new RegisterAuthorActivity((RegisterAuthorPlace)place, clientFactory);
		}
		else if (place instanceof MainPlace)
		{
			return new MainActivity(clientFactory, (MainPlace) place);
		}
		else if (place instanceof RegisterMaterialPlace)
		{
			return new RegisterMaterialActivity(clientFactory, (RegisterMaterialPlace) place);
		}
		return null;
	}

}
