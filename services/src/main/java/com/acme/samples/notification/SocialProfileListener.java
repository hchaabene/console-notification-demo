package com.acme.samples.notification;

import com.acme.samples.notification.plugin.UpdateProfilePlugin;
import org.exoplatform.commons.api.notification.NotificationContext;
import org.exoplatform.commons.api.notification.model.PluginKey;
import org.exoplatform.commons.notification.impl.NotificationContextImpl;
import org.exoplatform.social.core.identity.model.Profile;
import org.exoplatform.social.core.profile.ProfileLifeCycleEvent;
import org.exoplatform.social.core.profile.ProfileListenerPlugin;
public class SocialProfileListener extends ProfileListenerPlugin {
	@Override
	public void avatarUpdated(ProfileLifeCycleEvent event) {
		Profile profile = event.getProfile();
		NotificationContext ctx = NotificationContextImpl.cloneInstance().append(UpdateProfilePlugin.PROFILE, profile);
		ctx.getNotificationExecutor().with(ctx.makeCommand(PluginKey.key(UpdateProfilePlugin.ID))).execute(ctx);
	}
	@Override
	public void experienceSectionUpdated(ProfileLifeCycleEvent event) {
		Profile profile = event.getProfile();
		NotificationContext ctx = NotificationContextImpl.cloneInstance().append(UpdateProfilePlugin.PROFILE, profile);
		ctx.getNotificationExecutor().with(ctx.makeCommand(PluginKey.key(UpdateProfilePlugin.ID))).execute(ctx);
	}
	@Override
	public void contactSectionUpdated(ProfileLifeCycleEvent event) {
		Profile profile = event.getProfile();
		NotificationContext ctx = NotificationContextImpl.cloneInstance().append(UpdateProfilePlugin.PROFILE, profile);
		ctx.getNotificationExecutor().with(ctx.makeCommand(PluginKey.key(UpdateProfilePlugin.ID))).execute(ctx);
	}
	@Override
	public void createProfile(ProfileLifeCycleEvent event) {
		Profile profile = event.getProfile();
		NotificationContext ctx = NotificationContextImpl.cloneInstance().append(UpdateProfilePlugin.PROFILE, profile);
		ctx.getNotificationExecutor().with(ctx.makeCommand(PluginKey.key(UpdateProfilePlugin.ID))).execute(ctx);
	}
	@Override
	public void bannerUpdated(ProfileLifeCycleEvent arg0) {}
}
